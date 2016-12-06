package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryOrcidIdInverseIterator theterritoryOrcidIdInverseIterator = (territoryOrcidIdInverseIterator)findAncestorWithClass(this, territoryOrcidIdInverseIterator.class);
			pageContext.getOut().print(theterritoryOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

