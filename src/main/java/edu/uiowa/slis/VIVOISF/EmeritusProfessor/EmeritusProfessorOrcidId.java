package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorOrcidIdIterator theEmeritusProfessor = (EmeritusProfessorOrcidIdIterator)findAncestorWithClass(this, EmeritusProfessorOrcidIdIterator.class);
			pageContext.getOut().print(theEmeritusProfessor.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

