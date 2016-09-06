package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835Overview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835Overview currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835Overview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835 theOBI_0000835 = (OBI_0000835)findAncestorWithClass(this, OBI_0000835.class);
			if (!theOBI_0000835.commitNeeded) {
				pageContext.getOut().print(theOBI_0000835.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			OBI_0000835 theOBI_0000835 = (OBI_0000835)findAncestorWithClass(this, OBI_0000835.class);
			return theOBI_0000835.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0000835 for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			OBI_0000835 theOBI_0000835 = (OBI_0000835)findAncestorWithClass(this, OBI_0000835.class);
			theOBI_0000835.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for overview tag ");
		}
	}
}

