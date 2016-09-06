package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Excerpt theExcerpt = (Excerpt)findAncestorWithClass(this, Excerpt.class);
			if (!theExcerpt.commitNeeded) {
				pageContext.getOut().print(theExcerpt.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Excerpt theExcerpt = (Excerpt)findAncestorWithClass(this, Excerpt.class);
			return theExcerpt.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Excerpt for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Excerpt theExcerpt = (Excerpt)findAncestorWithClass(this, Excerpt.class);
			theExcerpt.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for label tag ");
		}
	}
}

