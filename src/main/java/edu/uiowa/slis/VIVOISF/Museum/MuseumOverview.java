package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			if (!theMuseum.commitNeeded) {
				pageContext.getOut().print(theMuseum.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			return theMuseum.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Museum for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			theMuseum.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for overview tag ");
		}
	}
}

