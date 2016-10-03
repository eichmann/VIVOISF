package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberProducerInverseIterator theFacultyMemberProducerInverseIterator = (FacultyMemberProducerInverseIterator)findAncestorWithClass(this, FacultyMemberProducerInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for producer tag ");
		}
		return SKIP_BODY;
	}
}

