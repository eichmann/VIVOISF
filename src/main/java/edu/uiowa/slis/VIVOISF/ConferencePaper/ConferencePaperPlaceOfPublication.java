package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			if (!theConferencePaper.commitNeeded) {
				pageContext.getOut().print(theConferencePaper.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			return theConferencePaper.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePaper for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			theConferencePaper.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for placeOfPublication tag ");
		}
	}
}

