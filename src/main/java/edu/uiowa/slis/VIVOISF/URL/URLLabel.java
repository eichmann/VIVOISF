package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(URLLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			URL theURL = (URL)findAncestorWithClass(this, URL.class);
			if (!theURL.commitNeeded) {
				pageContext.getOut().print(theURL.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing URL for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			URL theURL = (URL)findAncestorWithClass(this, URL.class);
			return theURL.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing URL for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			URL theURL = (URL)findAncestorWithClass(this, URL.class);
			theURL.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing URL for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for label tag ");
		}
	}
}

