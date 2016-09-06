package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractInformationResourceSupportedByIterator theAbstractInformationResourceSupportedByIterator = (AbstractInformationResourceSupportedByIterator)findAncestorWithClass(this, AbstractInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theAbstractInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

