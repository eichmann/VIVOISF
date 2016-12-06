package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaOrcidIdInverseIterator theareaOrcidIdInverseIterator = (areaOrcidIdInverseIterator)findAncestorWithClass(this, areaOrcidIdInverseIterator.class);
			pageContext.getOut().print(theareaOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

