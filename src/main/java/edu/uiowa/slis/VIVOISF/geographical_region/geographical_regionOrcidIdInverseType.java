package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionOrcidIdInverseIterator thegeographical_regionOrcidIdInverseIterator = (geographical_regionOrcidIdInverseIterator)findAncestorWithClass(this, geographical_regionOrcidIdInverseIterator.class);
			pageContext.getOut().print(thegeographical_regionOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

