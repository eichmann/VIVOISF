package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeOwnerInverseIterator theCommitteeOwnerInverseIterator = (CommitteeOwnerInverseIterator)findAncestorWithClass(this, CommitteeOwnerInverseIterator.class);
			pageContext.getOut().print(theCommitteeOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for owner tag ");
		}
		return SKIP_BODY;
	}
}

