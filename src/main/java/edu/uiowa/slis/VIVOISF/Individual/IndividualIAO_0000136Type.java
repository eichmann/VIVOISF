package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualIAO_0000136Iterator theIndividualIAO_0000136Iterator = (IndividualIAO_0000136Iterator)findAncestorWithClass(this, IndividualIAO_0000136Iterator.class);
			pageContext.getOut().print(theIndividualIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

