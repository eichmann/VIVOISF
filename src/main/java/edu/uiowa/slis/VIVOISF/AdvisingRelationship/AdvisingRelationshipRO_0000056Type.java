package edu.uiowa.slis.VIVOISF.AdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingRelationshipRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingRelationshipRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingRelationshipRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdvisingRelationshipRO_0000056Iterator theAdvisingRelationshipRO_0000056Iterator = (AdvisingRelationshipRO_0000056Iterator)findAncestorWithClass(this, AdvisingRelationshipRO_0000056Iterator.class);
			pageContext.getOut().print(theAdvisingRelationshipRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingRelationship for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingRelationship for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

