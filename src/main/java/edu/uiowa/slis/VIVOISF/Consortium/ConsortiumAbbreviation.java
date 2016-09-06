package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			if (!theConsortium.commitNeeded) {
				pageContext.getOut().print(theConsortium.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			return theConsortium.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Consortium for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			theConsortium.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for abbreviation tag ");
		}
	}
}

