package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			if (!theCenter.commitNeeded) {
				pageContext.getOut().print(theCenter.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Center for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			return theCenter.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Center for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			theCenter.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Center for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for overview tag ");
		}
	}
}

