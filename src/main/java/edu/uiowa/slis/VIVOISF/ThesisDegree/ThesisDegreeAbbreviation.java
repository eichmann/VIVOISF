package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			if (!theThesisDegree.commitNeeded) {
				pageContext.getOut().print(theThesisDegree.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			return theThesisDegree.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ThesisDegree for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			theThesisDegree.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for abbreviation tag ");
		}
	}
}

