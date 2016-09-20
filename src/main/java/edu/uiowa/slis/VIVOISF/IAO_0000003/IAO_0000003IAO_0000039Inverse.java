package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003IAO_0000039Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003IAO_0000039Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003IAO_0000039Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003IAO_0000039InverseIterator theIAO_0000003IAO_0000039InverseIterator = (IAO_0000003IAO_0000039InverseIterator)findAncestorWithClass(this, IAO_0000003IAO_0000039InverseIterator.class);
			pageContext.getOut().print(theIAO_0000003IAO_0000039InverseIterator.getIAO_0000039Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for IAO_0000039 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for IAO_0000039 tag ");
		}
		return SKIP_BODY;
	}
}

