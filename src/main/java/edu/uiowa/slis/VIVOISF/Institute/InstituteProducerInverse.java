package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteProducerInverseIterator theInstituteProducerInverseIterator = (InstituteProducerInverseIterator)findAncestorWithClass(this, InstituteProducerInverseIterator.class);
			pageContext.getOut().print(theInstituteProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for producer tag ");
		}
		return SKIP_BODY;
	}
}

