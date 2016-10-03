package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteDirectorInverseIterator theInstituteDirectorInverseIterator = (InstituteDirectorInverseIterator)findAncestorWithClass(this, InstituteDirectorInverseIterator.class);
			pageContext.getOut().print(theInstituteDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for director tag ");
		}
		return SKIP_BODY;
	}
}

