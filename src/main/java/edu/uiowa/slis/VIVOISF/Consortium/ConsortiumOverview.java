package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			if (!theConsortium.commitNeeded) {
				pageContext.getOut().print(theConsortium.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			return theConsortium.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Consortium for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			theConsortium.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for overview tag ");
		}
	}
}

