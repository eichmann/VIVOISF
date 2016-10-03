package edu.uiowa.slis.VIVOISF.PersonalCommunication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationBFO_0000055Iterator thePersonalCommunicationBFO_0000055Iterator = (PersonalCommunicationBFO_0000055Iterator)findAncestorWithClass(this, PersonalCommunicationBFO_0000055Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunication for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

