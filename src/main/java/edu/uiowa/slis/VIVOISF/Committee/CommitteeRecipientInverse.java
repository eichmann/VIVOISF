package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeRecipientInverseIterator theCommitteeRecipientInverseIterator = (CommitteeRecipientInverseIterator)findAncestorWithClass(this, CommitteeRecipientInverseIterator.class);
			pageContext.getOut().print(theCommitteeRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for recipient tag ");
		}
		return SKIP_BODY;
	}
}

