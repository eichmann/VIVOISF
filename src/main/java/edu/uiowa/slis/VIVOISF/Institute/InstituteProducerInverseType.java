package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteProducerInverseIterator theInstituteProducerInverseIterator = (InstituteProducerInverseIterator)findAncestorWithClass(this, InstituteProducerInverseIterator.class);
			pageContext.getOut().print(theInstituteProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for producer tag ");
		}
		return SKIP_BODY;
	}
}

