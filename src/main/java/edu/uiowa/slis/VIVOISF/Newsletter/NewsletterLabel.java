package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Newsletter theNewsletter = (Newsletter)findAncestorWithClass(this, Newsletter.class);
			if (!theNewsletter.commitNeeded) {
				pageContext.getOut().print(theNewsletter.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Newsletter theNewsletter = (Newsletter)findAncestorWithClass(this, Newsletter.class);
			return theNewsletter.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Newsletter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Newsletter theNewsletter = (Newsletter)findAncestorWithClass(this, Newsletter.class);
			theNewsletter.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for label tag ");
		}
	}
}

