package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeRecipientInverseIterator theCommitteeRecipientInverseIterator = (CommitteeRecipientInverseIterator)findAncestorWithClass(this, CommitteeRecipientInverseIterator.class);
			pageContext.getOut().print(theCommitteeRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for recipient tag ");
		}
		return SKIP_BODY;
	}
}

