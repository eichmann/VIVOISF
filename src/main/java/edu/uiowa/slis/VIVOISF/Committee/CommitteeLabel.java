package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			if (!theCommittee.commitNeeded) {
				pageContext.getOut().print(theCommittee.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			return theCommittee.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Committee for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Committee theCommittee = (Committee)findAncestorWithClass(this, Committee.class);
			theCommittee.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for label tag ");
		}
	}
}

