package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			if (!theChapter.commitNeeded) {
				pageContext.getOut().print(theChapter.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			return theChapter.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Chapter for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Chapter theChapter = (Chapter)findAncestorWithClass(this, Chapter.class);
			theChapter.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for placeOfPublication tag ");
		}
	}
}

