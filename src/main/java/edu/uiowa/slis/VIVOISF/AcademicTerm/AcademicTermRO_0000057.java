package edu.uiowa.slis.VIVOISF.AcademicTerm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicTermRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicTermRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicTermRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicTermRO_0000057Iterator theAcademicTermRO_0000057Iterator = (AcademicTermRO_0000057Iterator)findAncestorWithClass(this, AcademicTermRO_0000057Iterator.class);
			pageContext.getOut().print(theAcademicTermRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

