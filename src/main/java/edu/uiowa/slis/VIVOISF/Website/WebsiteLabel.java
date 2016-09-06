package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Website theWebsite = (Website)findAncestorWithClass(this, Website.class);
			if (!theWebsite.commitNeeded) {
				pageContext.getOut().print(theWebsite.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Website for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Website theWebsite = (Website)findAncestorWithClass(this, Website.class);
			return theWebsite.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Website for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Website theWebsite = (Website)findAncestorWithClass(this, Website.class);
			theWebsite.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Website for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for label tag ");
		}
	}
}

