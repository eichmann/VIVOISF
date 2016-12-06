package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009NationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009NationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009NationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009NationalityITIterator theIAO_0000009 = (IAO_0000009NationalityITIterator)findAncestorWithClass(this, IAO_0000009NationalityITIterator.class);
			pageContext.getOut().print(theIAO_0000009.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

