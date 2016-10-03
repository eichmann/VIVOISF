package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeMemberInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeMemberInverseIterator theThesisDegreeMemberInverseIterator = (ThesisDegreeMemberInverseIterator)findAncestorWithClass(this, ThesisDegreeMemberInverseIterator.class);
			pageContext.getOut().print(theThesisDegreeMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for member tag ");
		}
		return SKIP_BODY;
	}
}

