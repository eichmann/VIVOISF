package edu.uiowa.slis.VIVOISF.UndergraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateAdvisingRelationshipRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateAdvisingRelationshipRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateAdvisingRelationshipRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateAdvisingRelationshipRO_0000056Iterator theUndergraduateAdvisingRelationshipRO_0000056Iterator = (UndergraduateAdvisingRelationshipRO_0000056Iterator)findAncestorWithClass(this, UndergraduateAdvisingRelationshipRO_0000056Iterator.class);
			pageContext.getOut().print(theUndergraduateAdvisingRelationshipRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateAdvisingRelationship for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateAdvisingRelationship for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

