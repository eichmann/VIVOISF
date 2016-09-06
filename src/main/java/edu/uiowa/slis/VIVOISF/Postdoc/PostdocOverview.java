package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			if (!thePostdoc.commitNeeded) {
				pageContext.getOut().print(thePostdoc.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			return thePostdoc.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Postdoc for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			thePostdoc.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for overview tag ");
		}
	}
}

