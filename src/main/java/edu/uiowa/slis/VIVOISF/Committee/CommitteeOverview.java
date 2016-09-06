package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			if (!theCommittee.commitNeeded) {
				pageContext.getOut().print(theCommittee.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			return theCommittee.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Committee for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			theCommittee.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for overview tag ");
		}
	}
}

