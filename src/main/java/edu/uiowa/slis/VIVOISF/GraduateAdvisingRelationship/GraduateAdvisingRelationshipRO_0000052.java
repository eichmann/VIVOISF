package edu.uiowa.slis.VIVOISF.GraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateAdvisingRelationshipRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateAdvisingRelationshipRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateAdvisingRelationshipRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateAdvisingRelationshipRO_0000052Iterator theGraduateAdvisingRelationshipRO_0000052Iterator = (GraduateAdvisingRelationshipRO_0000052Iterator)findAncestorWithClass(this, GraduateAdvisingRelationshipRO_0000052Iterator.class);
			pageContext.getOut().print(theGraduateAdvisingRelationshipRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateAdvisingRelationship for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateAdvisingRelationship for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

