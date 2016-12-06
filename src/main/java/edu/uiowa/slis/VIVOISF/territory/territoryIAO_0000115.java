package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryIAO_0000115Iterator theterritory = (territoryIAO_0000115Iterator)findAncestorWithClass(this, territoryIAO_0000115Iterator.class);
			pageContext.getOut().print(theterritory.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

