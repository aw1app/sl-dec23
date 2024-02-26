import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
  standalone: true
})
export class HighlightDirective {

  constructor(private el: ElementRef, private renderer: Renderer2) { }

  @HostListener('mouseenter') onMouseEnter() {
    this.highlight('yellow');
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.highlight('lightgrey');
    this.changeFontSize('12px');
  }

  @HostListener('click') onMouseClick() {
    this.highlight('lightgreen');
    this.changeFontSize('48px');
  }

  private highlight(color: string | null) {
    this.el.nativeElement.style.backgroundColor = color;
  }

  private changeFontSize(size: string | "12px") {
    this.renderer.setStyle(this.el.nativeElement, 'font-size', size);
  }

}
