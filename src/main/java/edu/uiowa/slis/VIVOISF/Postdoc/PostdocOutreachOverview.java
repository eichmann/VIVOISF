package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			if (!thePostdoc.commitNeeded) {
				pageContext.getOut().print(thePostdoc.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			return thePostdoc.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Postdoc for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			thePostdoc.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for outreachOverview tag ");
		}
	}
}

