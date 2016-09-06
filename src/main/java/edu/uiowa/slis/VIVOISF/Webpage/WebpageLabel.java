package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Webpage theWebpage = (Webpage)findAncestorWithClass(this, Webpage.class);
			if (!theWebpage.commitNeeded) {
				pageContext.getOut().print(theWebpage.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Webpage theWebpage = (Webpage)findAncestorWithClass(this, Webpage.class);
			return theWebpage.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Webpage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Webpage theWebpage = (Webpage)findAncestorWithClass(this, Webpage.class);
			theWebpage.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for label tag ");
		}
	}
}

