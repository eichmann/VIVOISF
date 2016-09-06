package edu.uiowa.slis.VIVOISF.InvitedTalk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvitedTalkSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvitedTalkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InvitedTalkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InvitedTalk theInvitedTalk = (InvitedTalk)findAncestorWithClass(this, InvitedTalk.class);
			if (!theInvitedTalk.commitNeeded) {
				pageContext.getOut().print(theInvitedTalk.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InvitedTalk for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			InvitedTalk theInvitedTalk = (InvitedTalk)findAncestorWithClass(this, InvitedTalk.class);
			return theInvitedTalk.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing InvitedTalk for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			InvitedTalk theInvitedTalk = (InvitedTalk)findAncestorWithClass(this, InvitedTalk.class);
			theInvitedTalk.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing InvitedTalk for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for subjectURI tag ");
		}
	}
}

