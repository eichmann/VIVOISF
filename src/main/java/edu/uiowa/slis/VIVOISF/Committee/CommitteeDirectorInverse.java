package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeDirectorInverseIterator theCommitteeDirectorInverseIterator = (CommitteeDirectorInverseIterator)findAncestorWithClass(this, CommitteeDirectorInverseIterator.class);
			pageContext.getOut().print(theCommitteeDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for director tag ");
		}
		return SKIP_BODY;
	}
}

