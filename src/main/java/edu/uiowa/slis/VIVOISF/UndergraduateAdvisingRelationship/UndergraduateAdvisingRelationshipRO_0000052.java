package edu.uiowa.slis.VIVOISF.UndergraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateAdvisingRelationshipRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateAdvisingRelationshipRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateAdvisingRelationshipRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateAdvisingRelationshipRO_0000052Iterator theUndergraduateAdvisingRelationshipRO_0000052Iterator = (UndergraduateAdvisingRelationshipRO_0000052Iterator)findAncestorWithClass(this, UndergraduateAdvisingRelationshipRO_0000052Iterator.class);
			pageContext.getOut().print(theUndergraduateAdvisingRelationshipRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateAdvisingRelationship for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

