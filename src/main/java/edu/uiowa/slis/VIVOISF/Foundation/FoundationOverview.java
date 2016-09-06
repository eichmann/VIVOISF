package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			if (!theFoundation.commitNeeded) {
				pageContext.getOut().print(theFoundation.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			return theFoundation.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Foundation for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			theFoundation.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for overview tag ");
		}
	}
}

