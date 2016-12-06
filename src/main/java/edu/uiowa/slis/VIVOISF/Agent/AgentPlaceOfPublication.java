package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for placeOfPublication tag ");
		}
	}
}

