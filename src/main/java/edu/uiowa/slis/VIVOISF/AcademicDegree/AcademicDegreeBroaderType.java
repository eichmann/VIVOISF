package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeBroaderType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeBroaderType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeBroaderType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeBroaderIterator theAcademicDegreeBroaderIterator = (AcademicDegreeBroaderIterator)findAncestorWithClass(this, AcademicDegreeBroaderIterator.class);
			pageContext.getOut().print(theAcademicDegreeBroaderIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for broader tag ");
		}
		return SKIP_BODY;
	}
}

