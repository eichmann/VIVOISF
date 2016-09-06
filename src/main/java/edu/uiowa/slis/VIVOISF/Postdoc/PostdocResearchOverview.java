package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			if (!thePostdoc.commitNeeded) {
				pageContext.getOut().print(thePostdoc.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			return thePostdoc.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Postdoc for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			thePostdoc.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for researchOverview tag ");
		}
	}
}

