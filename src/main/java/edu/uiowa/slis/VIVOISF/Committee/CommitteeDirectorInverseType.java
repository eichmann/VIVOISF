package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeDirectorInverseIterator theCommitteeDirectorInverseIterator = (CommitteeDirectorInverseIterator)findAncestorWithClass(this, CommitteeDirectorInverseIterator.class);
			pageContext.getOut().print(theCommitteeDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for director tag ");
		}
		return SKIP_BODY;
	}
}

