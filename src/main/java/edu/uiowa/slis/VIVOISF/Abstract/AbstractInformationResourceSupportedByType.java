package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractInformationResourceSupportedByIterator theAbstractInformationResourceSupportedByIterator = (AbstractInformationResourceSupportedByIterator)findAncestorWithClass(this, AbstractInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theAbstractInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

