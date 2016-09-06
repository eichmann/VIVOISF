package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			if (!thePostdoc.commitNeeded) {
				pageContext.getOut().print(thePostdoc.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			return thePostdoc.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Postdoc for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			thePostdoc.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for teachingOverview tag ");
		}
	}
}

