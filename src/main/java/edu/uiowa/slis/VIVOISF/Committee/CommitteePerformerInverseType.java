package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteePerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteePerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteePerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteePerformerInverseIterator theCommitteePerformerInverseIterator = (CommitteePerformerInverseIterator)findAncestorWithClass(this, CommitteePerformerInverseIterator.class);
			pageContext.getOut().print(theCommitteePerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for performer tag ");
		}
		return SKIP_BODY;
	}
}

