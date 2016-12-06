package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009NationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009NationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009NationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009NationalityARIterator theIAO_0000009 = (IAO_0000009NationalityARIterator)findAncestorWithClass(this, IAO_0000009NationalityARIterator.class);
			pageContext.getOut().print(theIAO_0000009.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

