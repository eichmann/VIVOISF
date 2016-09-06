package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			if (!theThesisDegree.commitNeeded) {
				pageContext.getOut().print(theThesisDegree.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			return theThesisDegree.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ThesisDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ThesisDegree theThesisDegree = (ThesisDegree)findAncestorWithClass(this, ThesisDegree.class);
			theThesisDegree.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for label tag ");
		}
	}
}

