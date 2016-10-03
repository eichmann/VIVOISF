package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteePerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteePerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteePerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteePerformerInverseIterator theCommitteePerformerInverseIterator = (CommitteePerformerInverseIterator)findAncestorWithClass(this, CommitteePerformerInverseIterator.class);
			pageContext.getOut().print(theCommitteePerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for performer tag ");
		}
		return SKIP_BODY;
	}
}

