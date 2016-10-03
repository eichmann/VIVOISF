package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamProducerInverseIterator theTeamProducerInverseIterator = (TeamProducerInverseIterator)findAncestorWithClass(this, TeamProducerInverseIterator.class);
			pageContext.getOut().print(theTeamProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for producer tag ");
		}
		return SKIP_BODY;
	}
}

